package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.internship.Company;
import seedu.address.model.internship.Description;
import seedu.address.model.internship.Id;
import seedu.address.model.internship.Position;
import seedu.address.model.internship.Status;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;


/**
 * A utility class to help with building Internship objects.
 */
public class InternshipBuilder {
    public static final String DEFAULT_ID = "1";
    public static final String DEFAULT_POSITION = "Software Engineer";
    public static final String DEFAULT_COMPANY = "Grab";
    public static final Integer DEFAULT_STATUS = 1;
    public static final String DEFAULT_DESCRIPTION = "The is a dummy internship. Interview date on DDMMYYYY.";

    // private Id id;
    private Position position;
    private Company company;
    private Status status;
    private Id id;
    private Description description;
    private Set<Tag> tags;

    /**
     * Creates a {@code InternshipBuilder} with the default details.
     */
    public InternshipBuilder() {
        // id = new Id(DEFAULT_ID);
        position = new Position(DEFAULT_POSITION);
        company = new Company(DEFAULT_COMPANY);
        status = new Status(DEFAULT_STATUS);
        description = new Description(DEFAULT_DESCRIPTION);
        id = new Id(DEFAULT_ID);
        tags = new HashSet<>();
    }

    /**
     * Initializes the InternshipBuilder with the data of {@code internshipToCopy}.
     */
    public InternshipBuilder(Internship internshipToCopy) {
        id = internshipToCopy.getId();
        position = internshipToCopy.getPosition();
        company = internshipToCopy.getCompany();
        status = internshipToCopy.getStatus();
        description = internshipToCopy.getDescription();
        tags = new HashSet<>(internshipToCopy.getTags());
    }


    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Internship} that we are building.
     */
    public InternshipBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code id} of the {@code Internship} that we are building.
     */
    public InternshipBuilder withId(String id) {
        this.id = new Id(id);
        return this;
    }

    /**
     * Sets the {@code Position} of the {@code Internship} that we are building.
     */
    public InternshipBuilder withPosition(String position) {
        this.position = new Position(position);
        return this;
    }

    /**
     * Sets the {@code Company} of the {@code Internship} that we are building.
     */
    public InternshipBuilder withCompany(String company) {
        this.company = new Company(company);
        return this;
    }

    /**
     * Sets the {@code Status} of the {@code Internship} that we are building.
     */
    public InternshipBuilder withStatus(Integer status) {
        this.status = new Status(status);
        return this;
    }

    /**
     * Sets the {@code Description} of the {@code Internship} that we are building.
     */
    public InternshipBuilder withDescription(String description) {
        this.description = new Description(description);
        return this;
    }

    public Internship build() {
        return new Internship(position, company, id, status, description, tags);
    }

}

