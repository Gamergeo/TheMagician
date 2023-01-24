package com.project.magician.business.expansion;

import org.springframework.stereotype.Service;

import com.project.magician.business.DatabaseService;
import com.project.magician.model.expansion.Expansion;

@Service
public interface ExpansionService extends DatabaseService<Expansion> {
	
}

