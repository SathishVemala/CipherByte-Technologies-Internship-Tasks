𝐂𝐢𝐩𝐡𝐞𝐫𝐁𝐲𝐭𝐞 𝐓𝐞𝐜𝐡𝐧𝐨𝐥𝐨𝐠𝐢𝐞𝐬 𝐈𝐧𝐭𝐞𝐫𝐧𝐬𝐡𝐢𝐩 𝐓𝐚𝐬𝐤𝐬:


𝐓𝐚𝐬𝐤 𝟏: 𝐆𝐔𝐄𝐒𝐒 𝐓𝐇𝐄 𝐍𝐔𝐌𝐁𝐄𝐑

The fun and easy project "Guess the Number" is a short Java project that allows the user to guess the number generated by the computer & involves the following steps:
1. The system generates a random number from a given range, say 1 to 100.
2. The user is prompted to enter their given number in a displayed dialogue box.
3. The computer then tells if the entered number matches the guesses number or it is higher/lower than the generated number.
4. The game continues under the user guessing the number. You can also incorporate further details as:
• Limiting the number of attempts.
• Adding more rounds.
• Displaying score.
• Giving points based on the number of attempts.

Here's a detailed explanation of the code along with the expected output:

### Points Covered in the Code

1. **Imports and Initialization**:
   - `Scanner` is imported to take user input.
   - `Random` is imported to generate random numbers.
   - Variables `maxAttempts`, `maxRounds`, and `score` are initialized to set the game parameters.

2. **Game Setup**:
   - A `for` loop runs for a fixed number of rounds (`maxRounds`).

3. **Round Initialization**:
   - In each round, a random number between 1 and 100 is generated.
   - Variables `attempts` and `guessed` are initialized to track the number of attempts and whether the number has been guessed.

4. **User Interaction**:
   - The user is prompted to guess the number.
   - User's input is read and compared to the randomly generated number.
   
5. **Feedback Mechanism**:
   - If the user's guess is correct, a congratulatory message is printed, the score is updated based on the remaining attempts, and the loop breaks.
   - If the guess is too low or too high, appropriate feedback is given.

6. **End of Round**:
   - If the user exhausts all attempts without guessing the number, the correct number is revealed.

7. **End of Game**:
   - After all rounds are completed, the total score is displayed.

### How the Number is Guessed Correctly

- The user inputs a guess.
- The program compares this guess to the generated number.
- If the guess is correct, the program congratulates the user and awards points based on the remaining attempts.
- If the guess is incorrect, the program provides feedback to guide the user (whether the number is higher or lower).

### Expected Output

Assuming the user makes guesses, the output will look something like this:

```plaintext
Round 1 of 5: Guess the number between 1 and 100
Enter your guess: 50
The number is higher. Try again.
Enter your guess: 75
The number is lower. Try again.
Enter your guess: 60
The number is higher. Try again.
Enter your guess: 70
The number is lower. Try again.
Enter your guess: 65
The number is higher. Try again.
Enter your guess: 67
The number is lower. Try again.
Enter your guess: 66
Congratulations! You guessed the number in 7 attempts. You earned 4 points.

Round 2 of 5: Guess the number between 1 and 100
Enter your guess: 30
The number is higher. Try again.
Enter your guess: 50
Congratulations! You guessed the number in 2 attempts. You earned 9 points.

Round 3 of 5: Guess the number between 1 and 100
Enter your guess: 45
The number is lower. Try again.
Enter your guess: 20
The number is higher. Try again.
Enter your guess: 30
Congratulations! You guessed the number in 3 attempts. You earned 8 points.

Round 4 of 5: Guess the number between 1 and 100
Enter your guess: 10
The number is higher. Try again.
...
You've used all your attempts. The number was 58.

Round 5 of 5: Guess the number between 1 and 100
Enter your guess: 85
The number is lower. Try again.
Enter your guess: 75
Congratulations! You guessed the number in 2 attempts. You earned 9 points.

Game over! Your total score is: 30
```

The actual output will depend on the user's guesses and the random numbers generated in each round.

𝐂𝐥𝐢𝐜𝐤 𝐇𝐞𝐫𝐞: https://sathishvemala.github.io/Guess-The-Number/



𝐓𝐚𝐬𝐤 𝟐: 𝐁𝐀𝐍𝐊𝐘

BankY is a simulation of a basic banking system that allows users to create accounts, deposit and withdraw funds, and transfer funds between accounts.
This project provides an opportunity to explore fundamental concepts of object-oriented programming, data persistence using files or databases, and basic transaction handling.

# Bank Simulation Project

## Project Overview

This project is a simulation of a basic banking system that allows users to create accounts, deposit and withdraw funds, and transfer funds between accounts. The system persists account data using serialization, ensuring that account information is saved and loaded between sessions.

## Requirements

- **Java Development Kit (JDK) 8 or higher**
- **Integrated Development Environment (IDE) or command-line tools to compile and run Java programs**
- **File system access to store and read the serialized account data (`accounts.dat` file)**

## Project Structure

- `Account.java`: Represents a bank account with basic functionalities like deposit, withdrawal, and transfer.
- `Bank.java`: Manages multiple bank accounts, including creating new accounts and saving/loading account data to/from a file.
- `Main.java`: Provides a command-line interface for users to interact with the banking system.

## How the Project is Developed

1. **Account Class**:
    - Implements the `Serializable` interface to enable object serialization.
    - Contains attributes like `accountNumber`, `accountHolderName`, and `balance`.
    - Provides methods for depositing, withdrawing, and transferring funds.
    - Overrides `toString` method to display account information.

2. **Bank Class**:
    - Manages a collection of `Account` objects using a `HashMap`.
    - Provides methods to create accounts, retrieve accounts, and display all accounts.
    - Implements methods to save and load account data to/from a file using serialization.

3. **Main Class**:
    - Implements a command-line interface to interact with the user.
    - Provides options to create accounts, deposit, withdraw, transfer funds, and display all accounts.
    - Uses a `Scanner` object to read user input.

## How to Use the Project

1. **Compile the Project**:
    - Open a terminal or command prompt.
    - Navigate to the project directory.
    - Compile the Java files using the following command:
      ```sh
      javac Main.java
      ```

2. **Run the Project**:
    - After compiling, run the project using the following command:
      ```sh
      java Main
      ```

3. **Interact with the Command-Line Interface**:
    - Follow the on-screen prompts to interact with the banking system.
    - Options include creating accounts, depositing funds, withdrawing funds, transferring funds, and displaying all accounts.

## Example Output

```plaintext
1. Create Account
2. Deposit
3. Withdraw
4. Transfer
5. Show All Accounts
6. Exit
Choose an option: 1
Enter account number: 12345
Enter account holder name: John Doe
Account created successfully.
1. Create Account
2. Deposit
3. Withdraw
4. Transfer
5. Show All Accounts
6. Exit
Choose an option: 2
Enter account number: 12345
Enter amount to deposit: 1000
Deposit successful.
1. Create Account
2. Deposit
3. Withdraw
4. Transfer
5. Show All Accounts
6. Exit
Choose an option: 5
Account Number: 12345, Account Holder: John Doe, Balance: 1000.0
1. Create Account
2. Deposit
3. Withdraw
4. Transfer
5. Show All Accounts
6. Exit
Choose an option: 6
```

## Conclusion

This project demonstrates a simple banking system implemented in Java with object serialization to persist data. Users can create accounts, deposit and withdraw funds, transfer funds between accounts, and view account information through a command-line interface. The system ensures data persistence by saving and loading account information to and from a file.

𝐂𝐥𝐢𝐜𝐤 𝐇𝐞𝐫𝐞: https://sathishvemala.github.io/BankY/


