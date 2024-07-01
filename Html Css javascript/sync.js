console.log('starting...');

// function foo(fn){
//     setTimeout(function(){
//         console.log('foo');
//         // return 'success';
//         fn("success")
//     }, 5000);
    
// }
function foo(){
    return new Promise(function(resolve, reject){
        setTimeout(function(){
            console.log('foo');
            // return 'success';
            reject("failure")
        }, 5000);
    })
}

foo()
.then(function(result){
    console.log(result)
})

// foo(function (result){
//     console.log(result)
// })
// var result = foo();
// console.log(result);

console.log('finishing...')