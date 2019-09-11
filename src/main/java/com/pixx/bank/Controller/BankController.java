package com.pixx.bank.Controller;

import com.pixx.bank.Model.Bank_BranchesView;
import com.pixx.bank.Model.Branches;
import com.pixx.bank.Repo.Bank_branchesRepo;
import com.pixx.bank.Repo.BranchesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BankController {

    @Autowired BranchesRepo branchesRepo;

    @Autowired  Bank_branchesRepo bank_branchesRepo;

    @GetMapping("/")
    public String welcomePage(){
        return "Welcome to Bank Search Application" + "<br>" +

                "Step to get details: " + "<br>" +

                "1. Generate Jwt token with: /auth " + "<br>" +

                "2. Pass it in header with: Bearer token" + "<br>" +

                "3. Get bank details with ifsc code: /bank/ifsc" + "<br>" +

                "4. Get bank details with bank name and city name with offset and limit: /bank/'bankname'/'city'?offset = '' & limit = '' ";
    }

    @GetMapping("/banks")
    @ResponseBody
    public List<Branches> findByIfsc(@RequestParam("ifsc") String ifsc){
        return this.branchesRepo.findByIfsc(ifsc);
    }

    @GetMapping("/bank")
    @ResponseBody
    public List<Bank_BranchesView> findByBankNameAndCity(@RequestParam(name = "bank_name") String bank_name, @RequestParam(name = "city") String city,
                                                         @RequestParam("offset") int offset, @RequestParam("limit") int limit){
        Pageable pageable = PageRequest.of(offset,limit);
        return this.bank_branchesRepo.findByBankNameAndCity(bank_name,city,pageable);

    }
}