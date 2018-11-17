package com.salmon.sde.reportfetcher.repositories;

import com.salmon.sde.reportfetcher.entities.AsinReportLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsinReportLineRepository extends JpaRepository<AsinReportLine, Long>
{
}
