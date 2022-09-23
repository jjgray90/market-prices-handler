# market-prices-handler

Tasks Completed:
  - Receive market feed prices in CSV format
  - Implement an interface which converts said CSV line into a Price object
  - Apply commission to bid & ask prices
  - Throw exception if bid price is higher than ask
  - Remove historical messages under the same instrument
  - Print a subscribers messages to the console, including the commission
  - Write out dummy REST endpoints for posting & getting
  - Test the above functionality in J-Unit testing environment
 
 I began playing with the openCSV library in a separate branch, however started to run out of time to inmplement. I enjoyed getting to know it, and will try and refactor this project to read from a CSV file in my spare time.
