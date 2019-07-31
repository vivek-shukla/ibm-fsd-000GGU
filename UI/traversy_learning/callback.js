const posts = [
    { title: "Hello Bro",
      body: "body 1"

    },
    { title: "Hello Bro 2",
      body: "body 2"
    }
]

function getPosts() {
    setTimeout(()=>{
      let output = ''
      posts.forEach((post,index) => {

        output += `<li>${index}: ${post.title}<li>`
      });
      document.body.innerHTML=output
    },1000)  // callback function and time in second 
}

function createPost(post,callback) {
    setTimeout(()=>{
         posts.push(post)
         callback();
    },2000)
}

createPost({title:"hello bro3",body:"body 3"},getPosts);

getPosts();


// C:\Users\VivekShukla\Downloads\mongodb-win32-x86_64-2008plus-ssl-4.0.11\bin>mongo.exe
// MongoDB shell version v4.0.11
// connecting to: mongodb://127.0.0.1:27017/?gssapiServiceName=mongodb
// Implicit session: session { "id" : UUID("02f4d570-6d41-4663-ab11-8075e5e7359c") }
// MongoDB server version: 4.0.11
// Welcome to the MongoDB shell.
// For interactive help, type "help".
// For more comprehensive documentation, see
//         http://docs.mongodb.org/
// Questions? Try the support group
//         http://groups.google.com/group/mongodb-user
// Server has startup warnings:
// 2019-07-29T12:21:00.411+0530 I CONTROL  [initandlisten]
// 2019-07-29T12:21:00.412+0530 I CONTROL  [initandlisten] ** WARNING: Access control is not enabled for the database.
// 2019-07-29T12:21:00.413+0530 I CONTROL  [initandlisten] **          Read and write access to data and configuration is unrestricted.
// 2019-07-29T12:21:00.414+0530 I CONTROL  [initandlisten]
// 2019-07-29T12:21:00.415+0530 I CONTROL  [initandlisten] ** WARNING: This server is bound to localhost.
// 2019-07-29T12:21:00.416+0530 I CONTROL  [initandlisten] **          Remote systems will be unable to connect to this server.
// 2019-07-29T12:21:00.416+0530 I CONTROL  [initandlisten] **          Start the server with --bind_ip <address> to specify which IP
// 2019-07-29T12:21:00.417+0530 I CONTROL  [initandlisten] **          addresses it should serve responses from, or with --bind_ip_all to
// 2019-07-29T12:21:00.417+0530 I CONTROL  [initandlisten] **          bind to all interfaces. If this behavior is desired, start the
// 2019-07-29T12:21:00.418+0530 I CONTROL  [initandlisten] **          server with --bind_ip 127.0.0.1 to disable this warning.
// 2019-07-29T12:21:00.419+0530 I CONTROL  [initandlisten]
// ---
// Enable MongoDB's free cloud-based monitoring service, which will then receive and display
// metrics about your deployment (disk utilization, CPU, operation statistics, etc).

// The monitoring data will be available on a MongoDB website with a unique URL accessible to you
// and anyone you share the URL with. MongoDB may use this information to make product
// improvements and to suggest MongoDB products and deployment options to you.

// To enable free monitoring, run the following command: db.enableFreeMonitoring()
// To permanently disable this reminder, run the following command: db.disableFreeMonitoring()
// ---

// > show db
// 2019-07-29T12:45:04.225+0530 E QUERY    [js] Error: don't know how to show [db] :
// shellHelper.show@src/mongo/shell/utils.js:1066:11
// shellHelper@src/mongo/shell/utils.js:766:15
// @(shellhelp2):1:1
// > show dbs
// admin   0.000GB
// config  0.000GB
// local   0.000GB
// > use mongodb-practise
// switched to db mongodb-practise
// > db.createCollection("sample")
// { "ok" : 1 }
// > show collections
// sample
// > show collections("users")
// 2019-07-29T12:52:12.777+0530 E QUERY    [js] SyntaxError: missing ) after argument list @(shellhelp2):1:37
// > db.createCollection("users")
// { "ok" : 1 }
// > show dbs
// admin             0.000GB
// config            0.000GB
// local             0.000GB
// mongodb-practise  0.000GB
// > db.users.insert({name:"vivek", email:"geo4math"})
// WriteResult({ "nInserted" : 1 })
// > show collections
// sample
// users
// > db.products.insert({name:"iPhone", brand:"Apple"})
// WriteResult({ "nInserted" : 1 })
// > show collections
// products
// sample
// users
// > db.products.insert({name:"Honor10", brand:"Huawei", price:10000})
// WriteResult({ "nInserted" : 1 })
// > db.products.find()
// { "_id" : ObjectId("5d3e9fe6092df96a1baee2eb"), "name" : "iPhone", "brand" : "Apple" }
// { "_id" : ObjectId("5d3ea03c092df96a1baee2ec"), "name" : "Honor10", "brand" : "Huawei", "price" : 10000 }
// > db.products.insert({_id:43, name:"Honor1", brand:"Huawei", price:10000})
// WriteResult({ "nInserted" : 1 })
// > db.products.find()
// { "_id" : ObjectId("5d3e9fe6092df96a1baee2eb"), "name" : "iPhone", "brand" : "Apple" }
// { "_id" : ObjectId("5d3ea03c092df96a1baee2ec"), "name" : "Honor10", "brand" : "Huawei", "price" : 10000 }
// { "_id" : 43, "name" : "Honor1", "brand" : "Huawei", "price" : 10000 }
// > db.products.find().pretty()
// {
//         "_id" : ObjectId("5d3e9fe6092df96a1baee2eb"),
//         "name" : "iPhone",
//         "brand" : "Apple"
// }
// {
//         "_id" : ObjectId("5d3ea03c092df96a1baee2ec"),
//         "name" : "Honor10",
//         "brand" : "Huawei",
//         "price" : 10000
// }
// { "_id" : 43, "name" : "Honor1", "brand" : "Huawei", "price" : 10000 }
// > db.products.insert({_id:56, name:"Honor1", brand:"Huawei", price:10000000000000000000000000000000000000000})
// WriteResult({ "nInserted" : 1 })
// > db.products.find().pretty()
// {
//         "_id" : ObjectId("5d3e9fe6092df96a1baee2eb"),
//         "name" : "iPhone",
//         "brand" : "Apple"
// }
// {
//         "_id" : ObjectId("5d3ea03c092df96a1baee2ec"),
//         "name" : "Honor10",
//         "brand" : "Huawei",
//         "price" : 10000
// }
// { "_id" : 43, "name" : "Honor1", "brand" : "Huawei", "price" : 10000 }
// { "_id" : 56, "name" : "Honor1", "brand" : "Huawei", "price" : 1e+40 }
// > db.products.find({name:"Honor1"})
// { "_id" : 43, "name" : "Honor1", "brand" : "Huawei", "price" : 10000 }
// { "_id" : 56, "name" : "Honor1", "brand" : "Huawei", "price" : 1e+40 }
// > db.products.insert([{name:"samsung"},{name:"blackberry"}])
// BulkWriteResult({
//         "writeErrors" : [ ],
//         "writeConcernErrors" : [ ],
//         "nInserted" : 2,
//         "nUpserted" : 0,
//         "nMatched" : 0,
//         "nModified" : 0,
//         "nRemoved" : 0,
//         "upserted" : [ ]
// })
// > db.products.find()
// { "_id" : ObjectId("5d3e9fe6092df96a1baee2eb"), "name" : "iPhone", "brand" : "Apple" }
// { "_id" : ObjectId("5d3ea03c092df96a1baee2ec"), "name" : "Honor10", "brand" : "Huawei", "price" : 10000 }
// { "_id" : 43, "name" : "Honor1", "brand" : "Huawei", "price" : 10000 }
// { "_id" : 56, "name" : "Honor1", "brand" : "Huawei", "price" : 1e+40 }
// { "_id" : ObjectId("5d3ea352092df96a1baee2ed"), "name" : "samsung" }
// { "_id" : ObjectId("5d3ea352092df96a1baee2ee"), "name" : "blackberry" }
// > db.products.find({name:"Honor1"},{name:1})
// { "_id" : 43, "name" : "Honor1" }
// { "_id" : 56, "name" : "Honor1" }
// > db.products.find({name:"Honor1",{_id:{$ne:43}}},{name:1})
// 2019-07-29T13:19:30.801+0530 E QUERY    [js] SyntaxError: invalid property id @(shell):1:32
// > db.products.find({name:"Honor1",_id:{$ne:43}}},{name:1});
// 2019-07-29T13:23:09.338+0530 E QUERY    [js] SyntaxError: missing ) after argument list @(shell):1:45
// > db.products.find({name:"Honor1",_id:{$ne:43}},{name:1});
// { "_id" : 56, "name" : "Honor1" }
// > db.sample.drop()
// true
// > show collection
// 2019-07-29T13:25:36.609+0530 E QUERY    [js] Error: don't know how to show [collection] :
// shellHelper.show@src/mongo/shell/utils.js:1066:11
// shellHelper@src/mongo/shell/utils.js:766:15
// @(shellhelp2):1:1
// > show collections
// products
// users
// > db.products.update({name:"Honor1"),{$set:{release:2019}});
// 2019-07-29T13:30:57.890+0530 E QUERY    [js] SyntaxError: missing } after property list @(shell):1:33
// > db.products.update({name:"Honor1"},{$set:{release:2019}});
// WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })
// > db.products.find();
// { "_id" : ObjectId("5d3e9fe6092df96a1baee2eb"), "name" : "iPhone", "brand" : "Apple" }
// { "_id" : ObjectId("5d3ea03c092df96a1baee2ec"), "name" : "Honor10", "brand" : "Huawei", "price" : 10000 }
// { "_id" : 43, "name" : "Honor1", "brand" : "Huawei", "price" : 10000, "release" : 2019 }
// { "_id" : 56, "name" : "Honor1", "brand" : "Huawei", "price" : 1e+40 }
// { "_id" : ObjectId("5d3ea352092df96a1baee2ed"), "name" : "samsung" }
// { "_id" : ObjectId("5d3ea352092df96a1baee2ee"), "name" : "blackberry" }
// > db.products.updateMany({name:"Honor1"},{$set:{release:2019}});
// { "acknowledged" : true, "matchedCount" : 2, "modifiedCount" : 1 }
// > db.products.find();
// { "_id" : ObjectId("5d3e9fe6092df96a1baee2eb"), "name" : "iPhone", "brand" : "Apple" }
// { "_id" : ObjectId("5d3ea03c092df96a1baee2ec"), "name" : "Honor10", "brand" : "Huawei", "price" : 10000 }
// { "_id" : 43, "name" : "Honor1", "brand" : "Huawei", "price" : 10000, "release" : 2019 }
// { "_id" : 56, "name" : "Honor1", "brand" : "Huawei", "price" : 1e+40, "release" : 2019 }
// { "_id" : ObjectId("5d3ea352092df96a1baee2ed"), "name" : "samsung" }
// { "_id" : ObjectId("5d3ea352092df96a1baee2ee"), "name" : "blackberry" }
// >