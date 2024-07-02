<template>
    <h2>View Course</h2>
    <p>{{ course.title }}</p>
    <p>{{ course.price }}</p>
</template>
<script>
import CourseService from '../services/CourseService.js'
export default {

    data(){
        return {
            course: {
                title: 'Default Title',
                price: 0.0 
            }
        }
    },
    mounted(){
        console.log('On component init', this.$route.params.id);
        CourseService.getCourse(this.$route.params.id)
        .then(res=>{
            console.log(res);
            this.course.title = res.data.title
            this.course.price = res.data.price
        })
    }
}
</script>