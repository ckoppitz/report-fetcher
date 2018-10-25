package com.salmon.sde.reportfetcher.repositories;

import com.salmon.sde.reportfetcher.data.AdGroupReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdGroupReportRepository extends JpaRepository<AdGroupReport, Long>
{
	// Empty for now.
}
