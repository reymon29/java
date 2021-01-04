class CurrencyConverter {
  int rupee = 63;
  int dirham = 3; //UAE
  int real = 3; //brazilian
  int chilean_peso = 595;
  int mexican_peso = 18;
  int _yen = 107;
  int $austrailian = 2; //austrailian dollar
  int dollar;
  int Rupee63;

  void printCurrencies(){
    System.out.println("rupee " + rupee);
    System.out.println("$australian: " + $austrailian);
  }

  public static void main(String[] args){
    CurrencyConverter cc = new CurrencyConverter();
    cc.printCurrencies();
  }
}
