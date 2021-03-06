package com.github.spotbugs.internal;

import org.gradle.api.reporting.SingleFileReport;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;

import com.github.spotbugs.FindBugsReports;

public interface FindBugsReportsInternal extends FindBugsReports {
  @Internal
  SingleFileReport getFirstEnabled();

  @Input
  @Optional
  Boolean getWithMessagesFlag();
}