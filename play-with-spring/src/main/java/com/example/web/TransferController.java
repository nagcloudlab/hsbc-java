package com.example.web;

import com.example.dto.TransferRequest;
import com.example.dto.TransferResponse;
import com.example.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class TransferController {

    @Autowired
    private TransferService transferService;

    @RequestMapping(value = "/transfer",method = RequestMethod.POST)
    public TransferResponse transfer(@RequestBody TransferRequest transferRequest) {
        transferService.transfer(transferRequest.fromAccountNumber(),transferRequest.toAccountNumber(), transferRequest.amount());
        TransferResponse transferResponse=new TransferResponse("transfer successful");
        return transferResponse;
    }

}
