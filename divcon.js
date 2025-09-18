function divideconquer() {
  const numbers = [1, 4, 5, 6, 2];

  for (i = 0; i < numbers.length; i++) {
    if (numbers[i] > numbers[i + 1]) {
      temp_i = numbers[i + 1];
      numbers[i + 1] = numbers[i];
      numbers[i] = temp_i;
    }
    console.log(numbers);
  }
}

divideconquer();
