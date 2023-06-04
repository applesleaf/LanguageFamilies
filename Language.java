class Language{

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

   Language( String nameLang, int speakers, String regions, String wdOder){
    this.name = nameLang;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOder;
  }
  
  public void getInfo(){
    System.out.println( this.name +" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+".");
    System.out.println(" The language follows the word order "+this.wordOrder);
  }


  public static void main(String[] arg){
    Language lang = new Language("Spanish", 23,"Spain, Latin","subject-verb");
    lang.getInfo();

   Mayan mayan = new Mayan("Mayanis", 345434);
  mayan.getInfo();

  SinoTibetan chinese = new SinoTibetan("Chinese",12321232);
  chinese.getInfo();

  SinoTibetan burmese = new SinoTibetan("burmese", 213234232);
   burmese.getInfo();
  }

}