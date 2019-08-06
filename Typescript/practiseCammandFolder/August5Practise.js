var c = 'string';
console.log(c);
var obj = {
    name: 'Vivek',
    age: 25
};
var Alfonso = {
    id: 1,
    name: 'Alfonso Cuaron',
    movies: ["Children of MEN", "HARRY POTTER 3"]
};
// Alfonso.movies.forEach(movie=>console.log(movie)) 
var calc = function (i, j, operator) {
    switch (operator) {
        case '+': return i + j;
        case '-': return i - j;
        case '*': return i * j;
        case '/': return i / j;
    }
};
var Children_of_Men = {
    releaseDate: new Date(),
    movie_id: 101,
    title: 'Children of Men',
    avg_rating: 8.5
};
var Rust_and_Bone = {
    releaseDate: new Date(),
    movie_id: 102,
    title: 'Rust and Bone',
    avg_rating: 8
};
var Drama = {
    name: 'Drama',
    Movies: [Children_of_Men, Rust_and_Bone]
};
console.log("Genre: " + Drama.name + Drama.Movies.flatMap(function (movie) {
    return movie;
}));
// console.log(calc(12,56,'+'))
// console.log(calc(1,56,'-'))
// console.log(calc(12,56,'*'))
// console.log(calc(112,56,'/')) 
