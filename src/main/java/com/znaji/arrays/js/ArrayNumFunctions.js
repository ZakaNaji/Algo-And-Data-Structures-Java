function removeEvenNumbers(arr) {
  let newArr = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 !== 0) {
      newArr.push(arr[i]);
    }
  }
  return newArr;
}

function main() {
  let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  let newArr = removeEvenNumbers(arr);
  console.log(newArr);
}
main();
