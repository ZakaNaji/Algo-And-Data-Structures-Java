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
function findMax(arr) {
  let max = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}
function findSecondMax(arr) {
  let max = arr[0];
  let secondMax = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
      secondMax = max;
      max = arr[i];
    } else if (arr[i] > secondMax && arr[i] < max) {
      secondMax = arr[i];
    }
  }
  return secondMax;
}

function moveAllZerosToEnd(arr) {
  let zeroIndex = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== 0) {
      [arr[zeroIndex], arr[i]] = [arr[i], arr[zeroIndex]];
      zeroIndex++;
    }
  }
}

function main() {
  let arr = [0, 2, 1, 0, 0, 3];
  let arr1 = [1, 2, 1, 0, 0, 3, 0, 3];
  moveAllZerosToEnd(arr);
  console.log(arr);
}

main();
