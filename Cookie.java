class Cookie{
  int numCookies;
  int temp;
  int minutes;
  boolean isReady;

  Cookie(){
    numCookies = 0;
    temp = 0;
    minutes = 0;
    isReady = false;
  }

  Cookie(int aNumCookies, int aTemp, int aMinutes){
    numCookies = aNumCookies;
    temp = aTemp;
    minutes = aMinutes;
    isReady = false;
  }

  boolean getIsReady(){
    return isReady;
  }

  void setNumCookies(int aNumCookies){
    numCookies = aNumCookies;
  }

  void setBake(int aTemp, int aMinutes){
    System.out.println(numCookies + " cookies were baked at " + aTemp + " degrees F for " + aMinutes + " minutes.");
    isReady = true;
  }

}