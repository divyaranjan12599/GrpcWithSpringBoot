package com.client.service;

import com.client.ExceptionFolder.EmployeeNotFoundException;
import com.google.protobuf.Descriptors;
import com.grpcstubfolder.*;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmployeeServiceController {

    @GrpcClient("grpc-employee-client")
    public EmployeeServiceGrpc.EmployeeServiceBlockingStub employeeClient;


    public Map<Descriptors.FieldDescriptor, Object> getEmployee(int employeeId) throws EmployeeNotFoundException {
        // authorRequest = .newBuilder().setAuthorId(1).setName("jones").build();
        ReadId readId=ReadId.newBuilder().setEmployeeId(employeeId).build();
        Employee response=employeeClient.getemployeebyid(readId);
        if(response.getAllFields().isEmpty()){
            throw new EmployeeNotFoundException("employee with "+employeeId +" not  found");
        }

        return  response.getAllFields();

    }



}
