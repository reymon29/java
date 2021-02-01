class MoneyTransferService {
  // Transfer Amount: 63000.0
  // Transfer Fee: 1260.0
  double[] exchangeRates = new double[]{63,3,3,595,18,107,2};

  double computeTransferAmount(int countryIndex, double amount){
    return amount * exchangeRates[countryIndex];
  }

  double computeTransferFee(int countryIndex, double amount){
    return (amount * exchangeRates[countryIndex]) * 0.02;
  }

  public static void main(String[] args) {
  MoneyTransferService transferService = new MoneyTransferService();
  double transferAmount = transferService.computeTransferAmount(0, 1000);
  double transferFee = transferService.computeTransferFee(0, 1000);
  System.out.println("Transfer Amount: " + transferAmount);
  System.out.println("Transfer Fee: " + transferFee);
  }
}
