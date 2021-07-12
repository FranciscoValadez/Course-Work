// Author:  Francisco Valadez
// Date:    12/14/2020
// Purpose: This program lets the user input up to 20 integers and then shows the average, sum, highest number
//lowers number, and also lets the user find a specific number and tells them the position of that number

#include <string>
#include <iostream>
using namespace std;

//Protype declaration below
int max(int A[20], int N); // return max of first N integers in array A
int min(int A[20], int N); // return min of first N integers in array A
int sum(int A[20], int N); // return sum of first N integers in array A
int avg(int A[20], int N); // return average of first N integers in array A
void show(int A[20], int N); // print the first N integers in array A
int search(int A[20], int N, int K); // return position of K found in array A

//Varialbe declarations below
int A[20] = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
int N; // number of integers to be processed per user’s request
int K; // key number to be search in A[20] array per user’s request 
int pos; // position for the number K found in A[20] array, -1 if not found


int main()
{
    int counter = 0;
    int userAmount;
    int userSearch;
    int userInput;
    int total;
    int average;
    int maxNum;
    int minNum;

    string numEntered;
    cout << "Welcome to the Array Searching Game of Francisco Valadez" << endl;

    do
    {
        cout << ++counter << "=========================================================" << endl;

        do
        {
            cout << "Please enter how many integers you would like to play (up to 20, 0 to stop) > ";
            cin >> userAmount; //Gets users input and saves it in a string
        } while (userAmount < 0 || userAmount > 21);

        if (userAmount > 0 && userAmount < 21)
        {
            cout << "Please enter " << userAmount << " integers in any order> ";
            
            cin.ignore(); //Ignores the new lines from the previous user input
            
             //fills the array with user input
            for (int x =0; x < userAmount; x++)
                cin >> A[x];

            show(A, userAmount); //prints the user's input
            total = sum(A, userAmount); // Returns the sum of all numbers in the array
            average = avg(A, userAmount);// Returns the average
            maxNum = max(A, userAmount); // Returns the biggest number
            minNum = min(A, userAmount); // Returns the smallest number

            cout << "Max is " << maxNum << ", Min is " << minNum << ", Sum is " << total << ", and Average is " << average << endl;
            cout << ++counter << "=========================================================" << endl;

            do
            {
                cout << "Please enter a number to search (-1 to end the search)> ";
                cin >> userSearch;
                
                //k is assigned the value returned by the function below
                K = search(A, userAmount, userSearch);

                //If the number is not found the user is notified
                if (K != -1)
                    cout << "The number " << userSearch << " is found at the position " << K << endl;
                else
                    cout << "The number " << userSearch << " is not found." << endl;

            } while (userSearch != -1);
            
        }

    } while (userAmount != 0);

    //Goodbye Message
    cout << ++counter << "=========================================================" << endl;
    cout << "Thank you for playing this Array Searching Game of Francisco Valadez!" << endl;
    cout << ++counter << "=========================================================" << endl;
}

int max(int A[20], int N) // return max of first N integers in array A
{
    int maxNum = A[0];
    for (int x = 0; x < N; x++)
    {
        if (A[x] > maxNum)
            maxNum = A[x];
    }
    return maxNum;
}
int min(int A[20], int N) // return min of first N integers in array A
{
    int minNum = A[0];
    for (int x = 0; x < N; x++)
    {
        if (A[x] < minNum)
            minNum = A[x];
    }
    return minNum;
}
int sum(int A[20], int N) // return sum of first N integers in array A
{ 
    int sum = 0;

    for (int x = 0; x < N; x++)
    {
        sum += A[x];
    }

    return sum;
}
int avg(int A[20], int N) // return average of first N integers in array A
{
    int sum = 0;

    for (int x = 0; x < N; x++)
    {
        sum += A[x];
    }
    sum /= N;
    return sum;
}
void show(int A[20], int N) // print the first N integers in array A
{ 
    cout << "Your integers are: ";
    for (int x = 0; x < N; x++)
    {
        cout << A[x] << " ";
    }
    cout << "\n";
}
int search(int A[20], int N, int K) // return position of K found in array A
{
    int x;
    for (x = 0; x < N; x++)
    {
        if (A[x] == K)
            break;
    }
    if (A[x] != K)
        return -1;
    return x+1;
}  // return -1 if K is not found in array A
