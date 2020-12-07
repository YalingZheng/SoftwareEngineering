#include <iostream>

int main()
{
    int new_grade, index, limit_1, limit_2, freq[10] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    // The exception definition to deal with the end of the data
    class NegativeInputException {
    public:
        NegativeInputException() {
            std::cout << "End of input data reached\n";
        }
    };

    try {
        while (true) {
            std::cout << "Please input a grade\n";
            std::cin>>new_grade;
             if (new_grade < 0)
                throw NegativeInputException();
            index = new_grade / 10;
            try {
                if (index > 9)
                    throw new_grade;
                freq[index]++;
            } // end of inner try 
            catch (int grade) {
                if (grade == 100)
                    freq[9]++;
                else
                    std::cout << "Error -- new grade:" << grade << " is out of range [1, 100]\n";
            } // end of inner catch 
        } // end of while

    } // end of outer try
    catch (NegativeInputException e) {
        std::cout << " Limits   Frequency\n";
        for (index = 0; index < 10; index++) {
            limit_1 = 10 * index;
            limit_2 = limit_1 + 9;
            if (index == 9) {
                limit_2 = 100;
            } // end of if
        std::cout << limit_1 <<"-" << limit_2 <<"   " << freq[index] << "\n";
        } // end of for
    } // end of catch NegativeInputException
    // DOES C++ sppport finally blocks?
    // No, C++ does not support 'finally' blocks. 
} // end of main
