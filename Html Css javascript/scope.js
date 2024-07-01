// 1. Creation Phase [outer {x: undef, inner: undef} inner {x: undef}]
// 2. Execution Phase [outer {x: 2, inner: fn} inner {x: undef}]
function outer(){
    console.log('outer function');
    var x = 2;
    var inner = function(){
        console.log('inner function')
        console.log(x + 2);
        var x = 5;
    }
    return inner;
}

// var result = outer();
// result();
outer()();


// function print(fn){
//    fn(); 
// }

// function foo(){
//     console.log('foo')
// }
// print(foo);