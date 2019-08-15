<?php
//PROBLEM 4


class ClassNameHere
{
    public function arraySums(){
        $first_number = 5;
        $second_number = 7;
        $third_number = 11;
        $amountForFive = 0;
        $amountForSeven = 0;
        $amountForEleven = 0;

        for($fives_multiples = 5; $fives_multiples<=995; $fives_multiples++){
            $strarra =0;
            $amountForFive += (ord($strarra[$fives_multiples])*pow(5, $fives_multiples));

            echo $fives_multiples;
            //print out to test
            echo count($fives_multiples);
            //print out to test

            if(count($fives_multiples) > 995 ||count ($fives_multiples == null)){
                throw new Exception('DOES NOT WORK!\n
                PLEASE TRY AGAIN');
            }else{
                return $fives_multiples * 5;
            }
            $instance = new ClassNameHere();
            $instance->newVar = "The multiple of 5 should be " + $fives_multiples;
            //assign the new number to an instance variable
            //and use the object operator
            $instance->arraySums();
            /*
             * runs the function
             * in other words: (this.fives_multiples=fives_multiples)
             * or of this nature

            */
            return $fives_multiples;

            for($sevens_multiples = 7; $sevens_multiples <=994; $sevens_multiples++){
                $amountForSeven +=(ord($strarra[$sevens_multiples]));
                echo $sevens_multiples;
                echo count($sevens_multiples);

            }
            return$$sevens_multiples;

            for($elevens_multiples = 11; $elevens_multiples <= 990; $elevens_multiples++){
                $amountForEleven += (ord($strarra[$elevens_multiples]));
                echo $elevens_multiples;
                echo count($elevens_multiples);
            }
            return $elevens_multiples;
        }
    }

}