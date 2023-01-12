package com.bloomtechlabs.fp.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Postgresql table for households entity.
 * Attributes id & created_at are annotated to automatically generate. No setters are provided so that they cannot be changed.
 */
@Entity
@Table(name = "households")
public class Household {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column(name = "name")
    private String name;
    @Column(name = "times_homeless_in_three_years")
    private Integer times_homeless_in_three_years;
    @Column(name = "total_time_homeless_three_years")
    private Integer total_time_homeless_three_years;
    @Column(name = "total_time_homeless_past_year")
    private Integer total_time_homeless_past_year;
    @Column(name = "previously_living_in_non_human_habitation")
    private Boolean previously_living_in_non_human_habitation;
    @Column(name = "previously_living_in_emergency_shelter")
    private Boolean previously_living_in_emergency_shelter;
    @Column(name = "previously_unsheltered")
    private Boolean previously_unsheltered;
    @Column(name = "previous_stay_length")
    private Integer previous_stay_length;
    @Column(name = "needs_interpreter")
    private Boolean needs_interpreter;
    @Column(name = "access_to_private_transportation")
    private Boolean access_to_private_transportation;
    @Column(name = "client_or_family_physical_illness_history")
    private String client_or_family_physical_illness_history;
    @Column(name = "client_or_family_mental_illness_history")
    private String client_or_family_mental_illness_history;
    @Column(name = "client_or_family_personal_violence_history")
    private String client_or_family_personal_violence_history;
    @Column(name = "client_or_family_substance_dependency_history ")
    private String client_or_family_substance_dependency_history;
    @Column(name = "cps_involvement")
    private Boolean cps_involvement;
    @Column(name = "cps_involvement_active")
    private Boolean cps_involvement_active;
    @Column(name = "dcyf_contact_name")
    private String dcyf_contact_name;
    @Column(name = "dcyf_contact_email")
    private String dcyf_contact_email;
    @Column(name = "dcyf_contact_phone_number")
    private String dcyf_contact_phone_number;
    @Column(name = "section_8_voucher_lost")
    private Boolean section_8_voucher_lost;
    @CreationTimestamp
    private LocalDateTime created_at;

    public Household() {}

    private Household(HouseholdBuilder builder) {
        this.name = builder.name;
        this.times_homeless_in_three_years = builder().times_homeless_in_three_years;
        this.total_time_homeless_three_years = builder().total_time_homeless_three_years;
        this.total_time_homeless_past_year = builder().total_time_homeless_past_year;
        this.previously_living_in_non_human_habitation = builder().previously_living_in_non_human_habitation;
        this.previously_living_in_emergency_shelter = builder().previously_living_in_emergency_shelter;
        this.previously_unsheltered = builder().previously_unsheltered;
        this.previous_stay_length = builder().previous_stay_length;
        this.needs_interpreter = builder().needs_interpreter;
        this.access_to_private_transportation = builder().access_to_private_transportation;
        this.client_or_family_physical_illness_history = builder().client_or_family_physical_illness_history;
        this.client_or_family_mental_illness_history = builder().client_or_family_mental_illness_history;
        this.client_or_family_personal_violence_history = builder().client_or_family_personal_violence_history;
        this.client_or_family_substance_dependency_history = builder().client_or_family_substance_dependency_history;
        this.cps_involvement = builder().cps_involvement;
        this.cps_involvement_active = builder().cps_involvement_active;
        this.dcyf_contact_name = builder().dcyf_contact_name;
        this.dcyf_contact_email = builder().dcyf_contact_email;
        this.dcyf_contact_phone_number = builder().dcyf_contact_phone_number;
        this.section_8_voucher_lost = builder().section_8_voucher_lost;
    }

    public BigInteger getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimes_homeless_in_three_years() { return times_homeless_in_three_years; }
    public void setTimes_homeless_in_three_years(Integer times_homeless_in_three_years) {
        this.times_homeless_in_three_years = times_homeless_in_three_years;
    }

    public Integer getTotal_time_homeless_three_years() { return total_time_homeless_three_years; }
    public void setTotal_time_homeless_three_years(Integer total_time_homeless_three_years) {
        this.total_time_homeless_three_years = total_time_homeless_three_years;
    }

    public Integer getTotal_time_homeless_past_year() { return total_time_homeless_past_year; }
    public void setTotal_time_homeless_past_year(Integer total_time_homeless_past_year) {
        this.total_time_homeless_past_year = total_time_homeless_past_year;
    }

    public Boolean isPreviously_living_in_non_human_habitation() { return previously_living_in_non_human_habitation; }
    public void setPreviously_living_in_non_human_habitation(Boolean previously_living_in_non_human_habitation) {
        this.previously_living_in_non_human_habitation = previously_living_in_non_human_habitation;
    }

    public Boolean isPreviously_living_in_emergency_shelter() { return previously_living_in_emergency_shelter; }
    public void setPreviously_living_in_emergency_shelter(Boolean previously_living_in_emergency_shelter) {
        this.previously_living_in_emergency_shelter = previously_living_in_emergency_shelter;
    }

    public Boolean isPreviously_unsheltered() { return previously_unsheltered; }
    public void setPreviously_unsheltered(Boolean previously_unsheltered) {
        this.previously_unsheltered = previously_unsheltered;
    }

    public Integer getPrevious_stay_length() { return previous_stay_length; }
    public void setPrevious_stay_length(Integer previous_stay_length) {
        this.previous_stay_length = previous_stay_length;
    }

    public Boolean isNeeds_interpreter() { return needs_interpreter; }
    public void setNeeds_interpreter(Boolean needs_interpreter) {
        this.needs_interpreter = needs_interpreter;
    }

    public Boolean isAccess_to_private_transportation() { return access_to_private_transportation; }
    public void setAccess_to_private_transportation(Boolean access_to_private_transportation) {
        this.access_to_private_transportation = access_to_private_transportation;
    }

    public String getClient_or_family_physical_illness_history() { return client_or_family_physical_illness_history; }
    public void setClient_or_family_physical_illness_history(String client_or_family_physical_illness_history) {
        this.client_or_family_physical_illness_history = client_or_family_physical_illness_history;
    }

    public String getClient_or_family_mental_illness_history() { return client_or_family_mental_illness_history; }
    public void setClient_or_family_mental_illness_history(String client_or_family_mental_illness_history) {
        this.client_or_family_mental_illness_history = client_or_family_mental_illness_history;
    }

    public String getClient_or_family_personal_violence_history() { return client_or_family_personal_violence_history; }
    public void setClient_or_family_personal_violence_history(String client_or_family_personal_violence_history) {
        this.client_or_family_personal_violence_history = client_or_family_personal_violence_history;
    }

    public String getClient_or_family_substance_dependency_history() { return client_or_family_substance_dependency_history; }
    public void setClient_or_family_substance_dependency_history(String client_or_family_substance_dependency_history) {
        this.client_or_family_substance_dependency_history = client_or_family_substance_dependency_history;
    }

    public Boolean isCps_involvement() { return cps_involvement; }
    public void setCps_involvement(Boolean cps_involvement) {
        this.cps_involvement = cps_involvement;
    }

    public Boolean isCps_involvement_active() { return cps_involvement_active; }
    public void setCps_involvement_active(Boolean cps_involvement_active) {
        this.cps_involvement_active = cps_involvement_active;
    }

    public String getDcyf_contact_name() { return dcyf_contact_name; }
    public void setDcyf_contact_name(String dcyf_contact_name) {
        this.dcyf_contact_name = dcyf_contact_name;
    }

    public String getDcyf_contact_email() { return dcyf_contact_email; }
    public void setDcyf_contact_email(String dcyf_contact_email) {
        this.dcyf_contact_email = dcyf_contact_email;
    }

    public String getDcyf_contact_phone_number() { return dcyf_contact_phone_number; }
    public void setDcyf_contact_phone_number(String dcyf_contact_phone_number) {
        this.dcyf_contact_phone_number = dcyf_contact_phone_number;
    }

    public Boolean isSection_8_voucher_lost() { return section_8_voucher_lost; }
    public void setSection_8_voucher_lost(Boolean section_8_voucher_lost) {
        this.section_8_voucher_lost = section_8_voucher_lost;
    }

    public LocalDateTime getCreated_at() { return created_at; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Household household = (Household) o;
        return Objects.equals(id, household.id)
                && Objects.equals(name, household.name)
                && Objects.equals(times_homeless_in_three_years, household.times_homeless_in_three_years)
                && Objects.equals(total_time_homeless_three_years, household.total_time_homeless_three_years)
                && Objects.equals(total_time_homeless_past_year, household.total_time_homeless_past_year)
                && Objects.equals(previously_living_in_non_human_habitation, household.previously_living_in_non_human_habitation)
                && Objects.equals(previously_living_in_emergency_shelter, household.previously_living_in_emergency_shelter)
                && Objects.equals(previously_unsheltered, household.previously_unsheltered)
                && Objects.equals(previous_stay_length, household.previous_stay_length)
                && Objects.equals(needs_interpreter, household.needs_interpreter)
                && Objects.equals(access_to_private_transportation, household.access_to_private_transportation)
                && Objects.equals(client_or_family_physical_illness_history, household.client_or_family_physical_illness_history)
                && Objects.equals(client_or_family_mental_illness_history, household.client_or_family_mental_illness_history)
                && Objects.equals(client_or_family_personal_violence_history, household.client_or_family_personal_violence_history)
                && Objects.equals(client_or_family_substance_dependency_history, household.client_or_family_substance_dependency_history)
                && Objects.equals(cps_involvement, household.cps_involvement)
                && Objects.equals(cps_involvement_active, household.cps_involvement_active)
                && Objects.equals(dcyf_contact_name, household.dcyf_contact_name)
                && Objects.equals(dcyf_contact_email, household.dcyf_contact_email)
                && Objects.equals(dcyf_contact_phone_number, household.dcyf_contact_phone_number)
                && Objects.equals(section_8_voucher_lost, household.section_8_voucher_lost)
                && Objects.equals(created_at, household.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                times_homeless_in_three_years,
                total_time_homeless_three_years,
                total_time_homeless_past_year,
                previously_living_in_non_human_habitation,
                previously_living_in_emergency_shelter,
                previously_unsheltered,
                previous_stay_length,
                needs_interpreter,
                access_to_private_transportation,
                client_or_family_physical_illness_history,
                client_or_family_mental_illness_history,
                client_or_family_personal_violence_history,
                client_or_family_substance_dependency_history,
                cps_involvement,
                cps_involvement_active,
                dcyf_contact_name,
                dcyf_contact_email,
                dcyf_contact_phone_number,
                section_8_voucher_lost,
                created_at);
    }

    @Override
    public String toString() {
        return "Household{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", times_homeless_in_three_years=" + times_homeless_in_three_years +
                ", total_time_homeless_three_years=" + total_time_homeless_three_years +
                ", total_time_homeless_past_year=" + total_time_homeless_past_year +
                ", previously_living_in_non_human_habitation=" + previously_living_in_non_human_habitation +
                ", previously_living_in_emergency_shelter=" + previously_living_in_emergency_shelter +
                ", previously_unsheltered=" + previously_unsheltered +
                ", previous_stay_length=" + previous_stay_length +
                ", needs_interpreter=" + needs_interpreter +
                ", access_to_private_transportation=" + access_to_private_transportation +
                ", client_or_family_physical_illness_history='" + client_or_family_physical_illness_history + '\'' +
                ", client_or_family_mental_illness_history='" + client_or_family_mental_illness_history + '\'' +
                ", client_or_family_personal_violence_history='" + client_or_family_personal_violence_history + '\'' +
                ", client_or_family_substance_dependency_history='" + client_or_family_substance_dependency_history + '\'' +
                ", cps_involvement=" + cps_involvement +
                ", cps_involvement_active=" + cps_involvement_active +
                ", dcyf_contact_name='" + dcyf_contact_name + '\'' +
                ", dcyf_contact_email='" + dcyf_contact_email + '\'' +
                ", dcyf_contact_phone_number='" + dcyf_contact_phone_number + '\'' +
                ", section_8_voucher_lost=" + section_8_voucher_lost +
                ", created_at='" + created_at + '\'' +
                '}';
    }

    public static final HouseholdBuilder builder() {
        return new HouseholdBuilder();
    }

    public static class HouseholdBuilder {
        private String name;
        private Integer times_homeless_in_three_years;
        private Integer total_time_homeless_three_years;
        private Integer total_time_homeless_past_year;
        private Boolean previously_living_in_non_human_habitation;
        private Boolean previously_living_in_emergency_shelter;
        private Boolean previously_unsheltered;
        private Integer previous_stay_length;
        private Boolean needs_interpreter;
        private Boolean access_to_private_transportation;
        private String client_or_family_physical_illness_history;
        private String client_or_family_mental_illness_history;
        private String client_or_family_personal_violence_history;
        private String client_or_family_substance_dependency_history;
        private Boolean cps_involvement;
        private Boolean cps_involvement_active;
        private String dcyf_contact_name;
        private String dcyf_contact_email;
        private String dcyf_contact_phone_number;
        private Boolean section_8_voucher_lost;

        private HouseholdBuilder() {}

        public HouseholdBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public HouseholdBuilder withTimes_homeless_in_three_years(Integer times_homeless_in_three_years) {
            this.times_homeless_in_three_years = times_homeless_in_three_years;
            return this;
        }

        public HouseholdBuilder withTotal_time_homeless_three_years(Integer total_time_homeless_three_years) {
            this.total_time_homeless_three_years = total_time_homeless_three_years;
            return this;
        }

        public HouseholdBuilder withTotal_time_homeless_past_year(Integer total_time_homeless_past_year) {
            this.total_time_homeless_past_year = total_time_homeless_past_year;
            return this;
        }

        public HouseholdBuilder withPreviously_living_in_non_human_habitation(Boolean previously_living_in_non_human_habitation) {
            this.previously_living_in_non_human_habitation = previously_living_in_non_human_habitation;
            return this;
        }

        public HouseholdBuilder withPreviously_living_in_emergency_shelter(Boolean previously_living_in_emergency_shelter) {
            this.previously_living_in_emergency_shelter = previously_living_in_emergency_shelter;
            return this;
        }

        public HouseholdBuilder withPreviously_unsheltered(Boolean previously_unsheltered) {
            this.previously_unsheltered = previously_unsheltered;
            return this;
        }

        public HouseholdBuilder withPrevious_stay_length(Integer previous_stay_length) {
            this.previous_stay_length = previous_stay_length;
            return this;
        }

        public HouseholdBuilder withNeeds_interpreter(Boolean needs_interpreter) {
            this.needs_interpreter = needs_interpreter;
            return this;
        }

        public HouseholdBuilder withAccess_to_private_transportation(Boolean access_to_private_transportation) {
            this.access_to_private_transportation = access_to_private_transportation;
            return this;
        }

        public HouseholdBuilder withClient_or_family_physical_illness_history(String client_or_family_physical_illness_history) {
            this.client_or_family_physical_illness_history = client_or_family_physical_illness_history;
            return this;
        }

        public HouseholdBuilder withClient_or_family_mental_illness_history(String client_or_family_mental_illness_history) {
            this.client_or_family_mental_illness_history = client_or_family_mental_illness_history;
            return this;
        }

        public HouseholdBuilder withClient_or_family_personal_violence_history(String client_or_family_personal_violence_history) {
            this.client_or_family_personal_violence_history = client_or_family_personal_violence_history;
            return this;
        }

        public HouseholdBuilder withClient_or_family_substance_dependency_history(String client_or_family_substance_dependency_history) {
            this.client_or_family_substance_dependency_history = client_or_family_substance_dependency_history;
            return this;
        }

        public HouseholdBuilder withCps_involvement(Boolean cps_involvement) {
            this.cps_involvement = cps_involvement;
            return this;
        }

        public HouseholdBuilder withCps_involvement_active(Boolean cps_involvement_active) {
            this.cps_involvement_active = cps_involvement_active;
            return this;
        }

        public HouseholdBuilder withDcyf_contact_name(String dcyf_contact_name) {
            this.dcyf_contact_name = dcyf_contact_name;
            return this;
        }

        public HouseholdBuilder withDcyf_contact_email(String dcyf_contact_email) {
            this.dcyf_contact_email = dcyf_contact_email;
            return this;
        }

        public HouseholdBuilder withDcyf_contact_phone_number(String dcyf_contact_phone_number) {
            this.dcyf_contact_phone_number = dcyf_contact_phone_number;
            return this;
        }

        public HouseholdBuilder withSection_8_voucher_lost(Boolean section_8_voucher_lost) {
            this.section_8_voucher_lost = section_8_voucher_lost;
            return this;
        }

        public Household build() {
            return new Household(this);
        }
    }
}
