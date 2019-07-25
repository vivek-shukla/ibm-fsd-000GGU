// console.log("Hello Vivek")
// document.write("Welcome to Javascript")

// var uId = 10;
// console.log("uId is",uId)
// uId = 'Bob' 
// console.log(`uId is modified,${uId}`);
// console.log(`${3+4}`);
// // comment 
// /* 

// */
// let a=11;
// let b=11;
// document.write(`sum ${a+b}`); 

// // Array 
// let vals = [1,4,'Hello'];
// console.log(vals) 

// // print specific value 
// console.log(vals[0]); 
// // Modify element 
// vals[1]=88; 
// console.log(vals) 

// // delete key word to remove something 
// delete vals[0]
// console.log(vals)

// // complex array 
// let user1 = {
//     id:1,
//     name:"User One",
//     phone: 123,
//     email: "ggsp"

// }
// let user2 = { 
//     id:2,
//     name:"hose",
//     phone: 123,
//     email: "joe@email.com"

// };
// let user = [user1,user2]
// console.log(user[0].name) 
// if (user[0].email == undefined) {
//     console.log("Email does not exist ")
// } 
// else if (user[0].email=='ggsp') {  
//     console.log("in else if",user[0].email)


// }
// else {
//     console.log(user[0].email)
// }  

// let i=11
// let j=10
// if (i>j)
// {
//     console.log(i)
// }
// else 
// {
//     console.log(j) 
// }
// if (i>j)
// {
//     console.log(i)
// }
// else 
// {
//     console.log(j) 
// }
// var flag =0
// let sub = {
//     eng: 68,
//     math: 39,
//     cs: 72
// }  
 
// if( sub.eng + sub.mathj + sub.cs > 180 ) 
//  {
// if (sub.eng < 60 )
//   {
//     console.log("failed in english ");
//     flag=1;
//   }
// if (sub.math < 60 )
//   {
//     console.log(" failed in math");
//     flag=1;
//   } 
//   if (sub.cs < 60 )
//   {
//     console.log("failed in cs ");
//     flag=1; } 
// if(flag == 0)  { 
//     console.log(" passed ");
//  }
// } 
// else 
// {
//     console.log("failed")
// }  

// // Methods 
// var evenNums= [2,4,6,8]
// evenNums.push(10)
// console.log(evenNums) 
// evenNums.pop()
// console.log(evenNums)

// var oddNums= [1,3,5,7]
// oddNums = oddNums.concat(evenNums);
// console.log(oddNums); 



// /// loops 
// for(i=0;i<5;i++) {
//     console.log(i);

// } 
// i = 0 
// while(i<5) { 
//     console.log(i);
//     i++;

// }

// // do while 
// i=1;
// do {
//     console.log(i); 
//   }while (i<5);

// iteration through array 
// i =0; 
// console.log("break ")
// for(i=0;i<5;i++) {
//     console.log(i);
//     if(i == 2) 
//     {
//         break;
//     }
// }

// continue will skip anything in the loop after the condition is met 
// i =0; 
// console.log("break ")
// for(i=0;i<5;i++) {
//     console.log(i);
//     if(i == 2) 
//     {
//         continue;
//     }
// }

// a=0;
// b=1;
// temp=0; 
// console.log(0)

// for( let j=0;j<15;j++)
// {  
//     temp= a+b;
//     a=b;
//     b=temp;
//     console.log(temp);
    
// }

// for in loop 
console.log("For In Loop ");
let messages = ["hello","hi","howdy"]

// to get keys of object 
// standard interface 
vals = {
    one: 'one key ',
    two: " second key",
};
console.log(Object.keys(vals));









