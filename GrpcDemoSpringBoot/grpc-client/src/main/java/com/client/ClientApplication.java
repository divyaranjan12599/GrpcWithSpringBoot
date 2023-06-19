package com.client;



import com.client.service.BookAuthorControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {
        @Autowired
        public BookAuthorControllerService bookAuthorControllerService;

    public static void main(String[] args)
    {
        SpringApplication.run(ClientApplication.class, args);
//        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",6565).usePlaintext().keepAliveTime(150, TimeUnit.SECONDS).build();
//         BookAuthorServiceGrpc.BookAuthorServiceBlockingStub bookAuthorServiceBlockingStub=BookAuthorServiceGrpc.newBlockingStub(channel);
//        Author authorRequest= Author.newBuilder().setAuthorId(1).setName("ssslsl").build();
//        Author response=bookAuthorServiceBlockingStub.authorapi(authorRequest);
//        System.out.println(response.getAuthorId());
//        channel.shutdown();
//        BookAuthorControllerService bookAuthorControllerService=new BookAuthorControllerService();
//        bookAuthorControllerService.test();
//

    }
//        public void test(){
//            BookAuthorControllerService bookAuthorControllerService=new BookAuthorControllerService();
//            bookAuthorControllerService.test();
//        }

}
