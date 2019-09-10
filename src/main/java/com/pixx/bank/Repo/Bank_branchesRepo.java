package com.pixx.bank.Repo;

import com.pixx.bank.Model.Bank_BranchesView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface Bank_branchesRepo extends PagingAndSortingRepository<Bank_BranchesView, String> {

    //@Query("Select * From bank_branches Where bank_name='?' And city='?' ")
    List<Bank_BranchesView> findByBankNameAndCity(String bank_name, String city, Pageable p);
}
