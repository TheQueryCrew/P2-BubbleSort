// Bubble sort function
const bubbleSort = function (array) {

  // Loop through array accessing each element
  for (let i = 0; i < array.length; i++) {

    // for each iteration of outerloop, loop through array again but with starting index greater by one than the outerloops index
    for (let j = i + 1; j < array.length; j++) {

      // Check if element at i'th index is greater than the next element at J'th index, if yes then swap their values.
      if (array[j] < array[i]) [array[j], array[i]] = [array[i], array[j]];
    }
  }
  
  // Return sorted array
  return array;
};

// Test Data
arr = [2, 1, 6, 4, 9, 7, 5];

// Output
console.log(`arr = [${bubbleSort(arr)}]`);
