class CurrencyConverter {
  double[] exchangeRates;

  void printCurrencies(){
    System.out.println("\nrupee " + exchangeRates[0]);
    System.out.println("dirham " + exchangeRates[1]);
    System.out.println("real " + exchangeRates[2]);
    System.out.println("chilean_peso " + exchangeRates[3]);
    System.out.println("mexican_peso " + exchangeRates[4]);
    System.out.println("_yen " + exchangeRates[5]);
    System.out.println("$australian: " + exchangeRates[exchangeRates.length - 1]);
  }

  void setExchangeRates(double [] rates) {
    exchangeRates = rates;
  }

  void updateExchangeRate(int arrayIndex, double newVal) {
    exchangeRates[arrayIndex] = newVal;
  }

  double getExchangeRate(int arrayIndex){
    return exchangeRates[arrayIndex];
  }

  double computeTransferAmount(int arrayIndex, double amount){
    return amount * getExchangeRate(arrayIndex);
  }

  public static void main(String[] args){
    CurrencyConverter cc = new CurrencyConverter();
    // Jan 1
    double[] rates = {63,3,3,595,18,107,2};
    cc.setExchangeRates(rates);
    cc.printCurrencies();
    // Adding a new array after already declared
    rates = new double[]{65,5,3,595,18,107,2};
    cc.setExchangeRates(rates);
    cc.printCurrencies();
    // Invoking the new method updateExchangeRate
    cc.updateExchangeRate(0, 66);
    cc.printCurrencies();
    // Invoking the new method computeTransferAmount / getExchangeRate
    double amount = cc.computeTransferAmount(0, 1000);
    System.out.println("\nTransferred amount USD > rupee: " + amount);
  }
}
