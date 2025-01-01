Feature: To verify organeHRM webpage demo site

  Scenario Outline: To validate organehrm login page
    Given User should enter url
    When User should enter the "<username>" and "<password>"

    Examples: 
      | username | password |
      | Admin    | admin123 |

  Scenario Outline: TO validate organehrm my infor
    When user name should enter the Personal Details,fristname,lastname,nickname
      #1D list without header or aslist
      | pradhap    |
      | srinivasan |
      | lee        |

  Scenario Outline: To validate organehrm admin
    When user name should enter the admin infor

  Scenario Outline: To valdate organehrm jobtitles
    When user should enter the Job Title and Job Description,save
      #1D list without header or aslist
      | Software Testing99                                             |
      | skills or java , selenium , automation testing ,manual testing |

  Scenario Outline: To validate organehrm organization
    When User should enter the organization,generalinformation,organizationedit,organzationname
      #1D list without header or aslist
      | tcs   |
      | 19066 |

  Scenario Outline: To validate organehrm Qualifications
    When User should enter the Qualifications,Education,Educationadd,addEducationtext,addEducationsave
      #1D List without header or aslist
      | College Undergraduate55 |

  Scenario Outline: To validate organehrm Nationalities
    When User should enter the Nationalities,Nationalitiesadd,Nationalitiestext,Nationalitiessave
      #1D list without header or aslist
      | indain |

  Scenario Outline: To validate organehrm PIM
    When User should enter the PIM ,pimaddemployee,pimfirstname,pimlastname,pimsave
      #1D list without header or aslist
      | pradhap |
      | lee     |

  Scenario Outline: To validate organehrm leave
    When User should enter the leave ,leaveconfigute,leavetypes,leaveadd,leaveaddleavetype,leavesave
      #1D list without header or aslist
      | fever |

  Scenario Outline: To validate organehrm time
    When User should enter the time ,timeprojectinfo,timecustomers,timeadd,timeaddcustomername,timeaddcustomerdescription,timesave
      #1D list without header or aslist
      | pradhaplee                       |
      | iam having fever so i want leave |

  Scenario Outline: To validate organehrm Recruitment
    When User should enter the Recruitment ,Recruitmentcanditates ,Recruitmentcanditesadd ,Recruitmentfristname, Recruitmentlastname ,Recruitmentemail ,Recruitmentphonenumber,Recruitmentsave
      #1D list without header or aslist
      | pradhap           |
      | lee               |
      | pradhap@gmail.com |
      |        6383745686 |

  Scenario Outline: To validate organehrm claim
    When user should enter the claim,claimconfiguration,claimevents,claimeventsadd,claimeventsname,claimeventsdescription,claimsave
      #1D list without header or aslist
      | pradhaplee   |
      | good in java |

  Scenario Outline: To validate organehrm Buzz
    When user should enter the buzz,buzztext,buzzpost
      #1D list without header or aslist
      | pradhaplee |
