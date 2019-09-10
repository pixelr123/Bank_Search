package com.pixx.bank.Repo;

import com.pixx.bank.Model.Banks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<Banks, Long> {

}
