package com.client.service;


import com.grpcstubfolder.Author;
import com.grpcstubfolder.BookAuthorServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class BookAuthorControllerService
{


    //@GrpcGenerated("grpc-devproblems-service")
    @GrpcClient("grpc-devproblems-service")
    public BookAuthorServiceGrpc.BookAuthorServiceBlockingStub synchronousClient;

    public String  test(){
        Author authorRequest = Author.newBuilder().setAuthorId(1).setName("jones").build();

        Author authorResponse = synchronousClient.authorapi(authorRequest);
        System.out.println(authorResponse.getAuthorId());
        System.out.println("some random string "+authorResponse.getName());
        return authorResponse.getName();
    }




}
