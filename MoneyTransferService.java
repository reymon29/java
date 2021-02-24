class MoneyTransferService {
  // Transfer Amount: 63000.0
  // Transfer Fee: 1260.0
CurrencyConverter cc = new CurrencyConverter();

double computeTransferAmount(int countryIndex, double amount){

return amount * cc.getExchangeRate(countryIndex);

}

double computeTransferFee(int countryIndex, double amount){

return 0.02 * amount * cc.getExchangeRate(countryIndex);

}

public static void main(String[] args){

MoneyTransferService transferService = new MoneyTransferService();

        double transferAmount = transferService.computeTransferAmount(0, 1000);

        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);

        System.out.println("Transfer Fee: " + transferFee);

}

}
