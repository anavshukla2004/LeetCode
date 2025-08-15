select machine_id, round(avg(end -start),3) as processing_time
from
(select machine_id,process_id , max(case when activity_type='start' then timestamp END)as start,
max(case when activity_type='end' then timestamp END) as end
from Activity group  by machine_id,process_id) as new
group by machine_id;
