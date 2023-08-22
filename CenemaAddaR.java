class CenemaAddaR{
static String kannadaMovies[] = {"Yajamana","Om sai Prakash","Preethse","Shabdavedhi","Mata","Swalpa Adjust Madkoli","Arjun","Ganeshana Maduve","Devara Maga","Galate Aliyandru","Krishna Leele","Naga Devathe","Raajakumara","Chamundi","O Nanna Nalle","Mathadana","Nan Hendthi Chennagidale","Shruthi","Hagalu Vesha","Gaajina Mane","Mahathma","K.G.F","Meelana","Gaalipata","Simhadri"};
public static void main(String movie[]){
System.out.println("Main Started");
System.out.println("The length of Movies are: "+kannadaMovies.length);
System.out.println("The List Of Movies Are:");
for(int index=kannadaMovies.length-1 ; index>=0 ; index--){
System.out.println(kannadaMovies[index]);
}
System.out.println("Main Ended");
}
}