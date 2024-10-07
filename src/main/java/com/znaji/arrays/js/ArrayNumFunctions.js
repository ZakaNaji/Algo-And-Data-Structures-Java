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

function findMissingNumber(arr) {
  let n = arr.length + 1;
  let sum = (n * (n + 1)) / 2;
  for (let i = 0; i < arr.length; i++) {
    sum -= arr[i];
  }
  return sum;
}

function mergeSortedArrays(arr1, arr2) {
  let merged = [];
  let length = arr1.length + arr2.length;
  let i = 0,
    j = 0,
    k = 0;
  while (i < length) {
    if (j < arr1.length && (k === arr2.length || arr1[j] < arr2[k])) {
      merged.push(arr1[j]);
      j++;
    } else {
      merged.push(arr2[k]);
      k++;
    }
    i++;
  }
  return merged;
}

function arrayHasPairWithSum(arr, target) {
  let mapOfComplements = {};
  for (let i = 0; i < arr.length; i++) {
    let complement = target - arr[i];
    if (mapOfComplements[arr[i]]) {
      return `Yes array has a pair of complements: ${complement} and ${arr[i]}`;
    }
    mapOfComplements[complement] = true;
  }
  return "NO pair with complements";
}

function main() {
  let arr1 = [1, 3, 6, 7];
  console.log(arrayHasPairWithSum(arr1, 11));
}

main();
