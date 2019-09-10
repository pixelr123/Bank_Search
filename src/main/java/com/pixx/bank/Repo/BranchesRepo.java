package com.pixx.bank.Repo;

import com.pixx.bank.Model.Banks;
import com.pixx.bank.Model.Branches;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface BranchesRepo extends PagingAndSortingRepository<Branches, String> {
        List<Branches> findByIfsc(String ifsc);
}
