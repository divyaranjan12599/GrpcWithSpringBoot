package com.grpcservices;

import com.EmployeeDetails;
import com.grpcstubfolder.Employee;
import com.grpcstubfolder.EmployeeServiceGrpc;
import com.grpcstubfolder.ReadId;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.Optional;

@GrpcService
public class EmployeeService extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    @Override
    public void getemployeebyid(ReadId request, StreamObserver<Employee> responseObserver) {

        Employee.Builder response= Employee.newBuilder();
        Optional<EmployeeDetails> employeeDetails= getemployeedetails().stream()
                .filter(employee->request.getEmployeeId()==employee.getId())
                .findFirst();
        if(employeeDetails.isPresent())
        {
            response.setEmployeeId(employeeDetails.get().getId()).setName(employeeDetails.get().getName()).setDepartment(employeeDetails.get().getDepartmentId())
                    .setEmail(employeeDetails.get().getEmail());
            responseObserver.onNext(response.build());
            //responseObserver.onNext(response.setEmployeeId(123).build());
        }
        else{
            responseObserver.onNext(null);
        }


        responseObserver.onCompleted();

       // responseObserver.onNext(response.setEmployeeId(123).build());
    }

    public  ArrayList<EmployeeDetails> getemployeedetails(){
        ArrayList<EmployeeDetails> employeeDetailsArrayList =new ArrayList<>();
        employeeDetailsArrayList.add(new EmployeeDetails(1,"larry@gmail.com",1,"larry"));
        employeeDetailsArrayList.add(new EmployeeDetails(2,"jones@gmail.com",1,"jones"));
        employeeDetailsArrayList.add(new EmployeeDetails(3,"james@gmail.com",1,"james"));
        return employeeDetailsArrayList;
    }


}
