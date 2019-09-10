package com.pixx.bank.Service;

import com.pixx.bank.Model.Branches;
import com.pixx.bank.Repo.Bank_branchesRepo;
import com.pixx.bank.Repo.BranchesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
//    @Autowired
//    BranchesRepo branchesRepo;
//
//    @Autowired
//    Bank_branchesRepo bank_branchesRepo;
//
//    public List<Branches> findByIfsc(String ifsc){
////        Pageable page = new PageRequest(0,10);
////        List<Branches> result = branchesRepo.findByIfsc(ifsc,page);
//        return branchesRepo.findByIfsc(ifsc);
//    }
}

