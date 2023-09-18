import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//Class used to realiza compilation
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("= = = = = CINEPLAY = = = = =");
        System.out.println("tickets values: $15");
        System.out.println("= = = = = = = = = = = = = = ");
        System.out.println("What's the Movie you want view?[Insert the first name of movie]");
        String viewMovieName = input.nextLine();
        String andressApi = "http://www.omdbapi.com/?t="+ viewMovieName.replace(" ", "+")+"&apikey=5c92a716";
        System.out.println(andressApi);



        //INTEGRANDO API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(andressApi))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //API INTEGRADA
        var serverResponse = response.body();
        //System.out.println(serverResponse);

        //CONVERTING JSON TO OBJECT
        Gson convert = new Gson();
        Movie objectMovie = convert.fromJson(serverResponse, Movie.class);
        System.out.println(objectMovie);
        //JSON CONVERTED TO OBJECTO SUCCESSFUL!
        System.out.println("Do you want watch " + viewMovieName + "?[1]Yes[0]No");
        int pay = input.nextInt();

        if(pay == 1){
            double valueCustomeer = 0;
            System.out.println("How many tickets you will buy?");
            int quantityCustomeer = input.nextInt();

            double ticketsValue = quantityCustomeer * 15;

            System.out.println("Insert you Payment Value for ticket(TOTAL TO PAY $" + ticketsValue + ")");
            valueCustomeer = input.nextDouble();

            Payment payMethod = new Payment(valueCustomeer);
            payMethod.payToTicket(payMethod, quantityCustomeer);
        } else if (pay == 0) {
            System.out.println("Choose a new Movie !");
        }else{
            throw new Error("Invalid Choose! try insert a valid choose");
        };
    }
}
