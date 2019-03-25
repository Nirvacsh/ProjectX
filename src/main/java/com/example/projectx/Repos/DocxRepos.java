package com.example.projectx.Repos;

import com.example.projectx.Domain.DocxContext;
import org.springframework.data.repository.CrudRepository;

public interface DocxRepos extends CrudRepository<DocxContext, Long> {
}
