package prime;

import java.util.ArrayList;

public class algorithm {

    public ArrayList primes(int numbers){
        boolean[] listOfNumbers = new boolean[numbers+1];
        ArrayList<Integer> listOfPrimes = new ArrayList<>();

        for (int i = 1; i <= numbers; i++){
            int k = i + 1;
            if (listOfNumbers[k] == false){
                if ((k*k) > numbers){
                    break;
                }
                for (int j = k * k; j <= numbers; j = j + k){
                    listOfNumbers[j] = true;
                }
            }
        }

        for (int i = 1; i <= numbers; i++){
            if (listOfNumbers[i] == false){
                listOfPrimes.add(i);
            }
        }

        return listOfPrimes;

    }
}
