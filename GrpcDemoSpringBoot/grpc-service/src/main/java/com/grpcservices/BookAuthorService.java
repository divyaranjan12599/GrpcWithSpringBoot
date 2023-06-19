package com.grpcservices;




import com.grpcstubfolder.Author;
import com.grpcstubfolder.BookAuthorServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class BookAuthorService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase {
    @Override
    public void authorapi(Author request, StreamObserver<Author> responseObserver) {
        Author.Builder response= Author.newBuilder();
        response.setAuthorId(request.getAuthorId()).setName(request.getName());
        System.out.println(request.getName());
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
   
}
