# Family-Promise-Case-Management

## Introduction

Family Promise helps local communities coordinate their compassion to address the root causes of family homelessness. They tap existing local resources to empower families towards economic stability. Families come to them in crisis; they help them rebuild their lives with new skills and ongoing support. They address the issue holistically, providing prevention services before families reach a crisis, shelter and case management when they become homeless, and stabilization programs once they have secured housing to ensure they remain independent.

## Problem Statement

Case Managers for Family Promise do not have a standard process to manage families.  Cases are managed manually through spreadsheets and other documentation.

## Solution

Family Promise needs a case management system for case managers to access data in the case database across FP products.  This system will help them access Create a case management system that is private to Family Promise.  The case management system must allow the case manager to view the following attributes within the object:

Phase 1 Attributes:

- Easy-to-use interface
- Household Information (Family Data = immediate family members)
- Head of Household (main point of contact)
- Store Documentation
    - Applications
    - Identification
    - Any other required documentation noted via the stakeholder
- Capture & Save Notes

## Technologies BD Learning

- Postgres - DB
- Springboot - API

## BD BE Steps - Actions

- Review the Existing Schema & Design
- Creation and Migration of the Database
- Case Creation
    - Input from the intake form
    - Create a Table and Crud Workflow
        - S3 Documentation
    - Separate each section into end points
    - Implement Auth0
- Export of case notes
- Export of intake information into form
- FCMS Enrollment
    - Program Selection
- Time Reporting
- Time Tracking
- Notes Export
    - Export for timestamps and total time
        - In Export, we will want the the program that they are enrolled in
- Calendar Integrations - Google Calendar Integration - 10K hits Something to review and discuss with Chris

### Basic Java API Scaffold

Welcome to your `Family Promise`. Use this to start your own Greenfield Project using java, spring, and common industry standards.

This repository assumes a handful of industry practices and standards. We strive to keep you on the bleeding edge of the industry and as a result, we have made some opinions for you so that you don't have to; you're welcome.


## Getting Started

### Environment Variables

- `awsaccesskey` - key to access aws instance local/deployed
- `awssecretkey` - authorization token for aws instance (eg. SUPERSECRET)
- `dynamodburl` - connection string for dynamo

See application-dev.properties for example values

# Pagination
To add pagination to your service and controller, follow these steps:

## Service Class
1. Add a method named getAllExamplesPaginated that takes in two arguments: offset and limit.
2. Implement the logic for fetching a paginated list of Example objects from your data source (e.g. database).

Example:
```
  /**
  * @param offset page index to return results from.
  * @param limit number of results to include per page.
  * @return returns a paginated list of Example objects.
  */
  public Page<Example> getAllExamplesPaginated(int offset, int limit) {
  return exampleRepository.findAll(PageRequest.of(offset, limit));
  }
```
## Controller Class
1. Add a method named getAllExamplesPaginated that takes in two @PathVariable arguments: offset and limit.
2. Call the getAllExamplesPaginated method from your service class, passing in the offset and limit arguments.
3. Return the paginated results as a JSON response to the client.

Example:
```
  /**
  * @param offset page index to return results from.
  * @param limit number of results to include per page.
  * @return returns a paginated list of Example objects.
  */
  @GetMapping("{offset}/{limit}")
  public ResponseEntity<Page<Example>> getAllExamplePaginated(@PathVariable int offset, @PathVariable int limit) {
  return ResponseEntity.ok(exampleService.getAllExamplesPaginated(offset, limit));
  }
```
