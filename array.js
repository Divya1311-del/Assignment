const arr1=[7,4,89,47,78,67];
function arrSort(arr){
    arr.sort((a,b)=>a-b);
    arr.reverse();
    return arr;
}
console.log(arrSort(arr1));