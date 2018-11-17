package com.salmon.sde.reportfetcher.repositories;

import com.salmon.sde.reportfetcher.entities.CampaignReportLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignReportLineRepository extends JpaRepository<CampaignReportLine, Long>
{
}
