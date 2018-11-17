package com.salmon.sde.reportfetcher.repositories;

import com.salmon.sde.reportfetcher.entities.KeywordReportLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordReportLineRepository extends JpaRepository<KeywordReportLine, Long>
{
}
