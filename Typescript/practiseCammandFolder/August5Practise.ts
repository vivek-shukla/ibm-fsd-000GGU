let c = 'string';
console.log(c)

let obj:any= {
    name: 'Vivek',
    age: 25
} 
// console.log(obj)


// to bind that some object has specific attribute we use interface 

// interface defines structure

// interface works as template 
// for two types  number | string 
interface director {
    id:number,
    name: string,
    movies: any[],
    tvSeries ?: any[]
}

let Alfonso:director = {
    id: 1,
    name: 'Alfonso Cuaron',
    movies: ["Children of MEN","HARRY POTTER 3"]

}

// Alfonso.movies.forEach(movie=>console.log(movie)) 

const calc = (i:number,j:number,operator:string):number => { 
    switch(operator) {
        case '+': return i+j;
        case '-': return i-j;
        case '*': return i*j;
        case '/': return i/j;

    }

} 

interface Array<T> {
    flat(): Array<T>;
    flatMap(func: (x: T) => T): Array<T>;
}

interface movie {

    releaseDate: Date,
    movie_id: number,
    title: string,
    avg_rating: number;

}
interface genre { 
    name: string,
    Movies: movie[]
}

const Children_of_Men:movie = {
    releaseDate: new Date(),
    movie_id: 101,
    title: 'Children of Men',
    avg_rating: 8.5
}

const Rust_and_Bone:movie = { 
    releaseDate: new Date(),
    movie_id: 102,
    title: 'Rust and Bone',
    avg_rating: 8
}

const Drama:genre = {
    name: 'Drama',
    Movies: [Children_of_Men,Rust_and_Bone]
}

console.log(`Genre: ${Drama.name}` + Drama.Movies.flatMap(movie=>{
    return movie;
}));

// console.log(calc(12,56,'+'))
// console.log(calc(1,56,'-'))
// console.log(calc(12,56,'*'))
// console.log(calc(112,56,'/')) 
