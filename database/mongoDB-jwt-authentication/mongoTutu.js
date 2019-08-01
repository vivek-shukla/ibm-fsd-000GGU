

db.createUser({
    user: "vivek",
    pwd: "vivelk@123",
    roles: [
        {
            role: "userAdminAnyDatabase",
            db: "admin"
        },
        "readWriteAnyDatabase"
    ]
})

db.createUser({
    user: "testUser",
    pwd: "test@123",
    roles: [
        {
            role: "seeGameState",
            db:  "ticTacDatabase"
        }
    ]
})

db.createUser({
    user: "testUser1",
    pwd: "test1@123",
    roles: [
        {
            role: "read",
            db:  "ticTacDatabase"
        },
        {
            role: "read",
            db:  "jwtDatabase"
        }
    ]
})
db.createRole({
    role: "seeGameState",
    privileges: [
      { resource: { db: "ticTacDatabase", collection: "gameState" }, actions: [ "find" ] }

    ],
    roles: []
  }
);

