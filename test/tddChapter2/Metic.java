package tddChapter2;

public class Metic {

        public int sumOfThreeNumbers(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }

        public int averageOfThreeNumbers(int num1, int num2, int num3) {
            return (num1 + num2 + num3) / 3;
        }

        public int productOfThreeNumbers(int num1, int num2, int num3) {
            return num1 * num2 * num3;
        }

        public int smallestOfThreeNumbers(int num1, int num2, int num3) {
            int smallest = num1;
            if(num2 < smallest){
                smallest = num2;
                if(num3 < smallest){
                    smallest = num3;
                }
            }
            return smallest;
        }

        public int largestOfThreeNumbers(int num1, int num2, int num3) {
            int largest = num1;
            if(num2 > largest){
                largest = num2;
                if(num3 > largest){
                    largest = num3;
                }
            }
            return largest;
        }

        public int squareOfANumber(int num1) {
            return num1 * num1;
        }

        public int sumOfSquaresOfNumber(int num1, int num2) {
            int sum = (num1 * num1) + (num2 * num2);
            return sum;
        }

        public int differencesOfASquareOfNumber(int num1, int num2) {
            int sum = (num1 * num1) - (num2 * num2);
            return sum;
        }
    }


