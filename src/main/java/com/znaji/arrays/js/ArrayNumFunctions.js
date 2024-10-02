function removeEvenNumbers(arr) {
  let newArr = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 !== 0) {
      newArr.push(arr[i]);
    }
  }
  return newArr;
}
function reverseArray(arr) {
  for (let i = 0; i < arr.length / 2; i++) {
    let temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
  }
}

function main() {
  let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
  console.log("Original Array: " + arr);
  reverseArray(arr);
  console.log("Reverse Array: " + arr);
}

main();
