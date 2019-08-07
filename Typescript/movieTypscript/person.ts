export interface person {
    id: number,
    name: string,
    dob: Date,
    gender: string
}

export interface actor extends person  { 
    Acted_in : movie[],
}
