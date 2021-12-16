package com.gemmausiku.thesisnotes.data

object DataManager { // Data Manager is declared as an object to make it a singleton
    val chapters = HashMap<String, ChapterInfo>()
    val notes = ArrayList<NoteInfo>()

    init {   //initializer block
        initializeChapters()
        initializeNotes()
    }

    private fun initializeChapters() {
        var chapter = ChapterInfo("chapter_1", "Chapter 1: INTRODUCTION")
        chapters[chapter.chapterId] = chapter

        chapter = ChapterInfo("chapter_2", "Chapter 2: LITERATURE REVIEW")
        chapters[chapter.chapterId] = chapter

        chapter = ChapterInfo("chapter_3", "Chapter 3: METHODOLOGY")
        chapters[chapter.chapterId] = chapter

        chapter = ChapterInfo("chapter_4", "Chapter 4: FINDINGS")
        chapters[chapter.chapterId] = chapter

        chapter = ChapterInfo("chapter_5", "Chapter 5: DISCUSSION")
        chapters[chapter.chapterId] = chapter

    }

    private fun initializeNotes() {

        var chapter = chapters["chapter_1"]!!
        var note = NoteInfo(chapter, "Chapter 1: Introduction",
            "The Introduction is not a narrative.It is only a heading under " +
                    "which the following six narrative sections appear: \n" +
                    " General Statement of the Problem, Significance of the" +
                    " Thesis, Research" +
                    "Question(s), Limitations and Delimitations, Assumptions, and Definitions " +
                    "of Terms These sections help the reader" +
                    "understand what" +
                    "will be presented in the thesis, and why" +
                    "“The author(s) should indicate why the study is important"+
                    "(McMillan & Schumacher, 2010).")
        notes.add(note)
        note = NoteInfo(chapter, "Background Research",
            "This section describes generally about the intended study. " +
                    "Details and elaborations of this" +
                    "section are the importance of the research's ideas.")
        notes.add(note)

        chapter = chapters["chapter_2"]!!
        note = NoteInfo(chapter, "Chapter 2: Literature Review",
            "This section outlines what you learned from previous contributors to the field." +
                    "It brings the researcher and the reader up to date" +
                    " on what others did relevant to the topic.\n" +
                    " The Review of Related Literature section addresses the questions: \n" +
                    "How unique is this thesis? Is it a logical" +
                    "expansion of previous work? and Has this already been done?”")
        notes.add(note)
        note = NoteInfo(chapter, "Introductory section",
            "Identifies common topics, issues, or areas of focus, " +
                    "then provide the appropriate context" +
                    "for the literature review. ")
        notes.add(note)

        chapter = chapters["chapter_3"]!!
        note = NoteInfo(chapter, "Chapter 3: Methodology",
            "This section helps readers to determine the validity of the research.\n" +
                    " “Can the data collected, for example, actually be used to answer " +
                    "the question being asked” (Locke,Silverman, & Spirduso, 2010)")
        notes.add(note)
        note = NoteInfo(chapter, "the research approach section,",
            "Research approach, for example qualitative or quantitative research, " +
                    "Mixed-Method,Design and Developmental Research (DDR), " +
                    "Design-based Research (DBR) and Action Research.")
        notes.add(note)

        chapter = chapters["chapter_4"]!!
        note = NoteInfo(chapter, "Chapter 4: Findings",
            "Report and discuss your results here. Use charts, tables, " +
                    "and graphs when appropriate, but " +
                    "include a narrative that describes what you consider " +
                    "the most relevant information.")
        notes.add(note)
        note = NoteInfo(chapter, "Data Analysis Results",
            "The overall findings and analysis" +
                    "of the study can be presented in form of tables, figures," +
                    " and statements to highlight important findings.\n" +
                    " Each table should consist of the introduction of the table, " +
                    "table and description of the table")
        notes.add(note)

        chapter = chapters["chapter_5"]!!
        note = NoteInfo(chapter, "Chapter 5: Discussion",
            "Discussion, Conclusions, Limitations and Recommendations \n" +
                    "This chapter should briefly summarize the research findings. \n " +
                    "Next, this chapter also discusses the findings by referring" +
                    " to theories and past researches discussed in the literature review. \n" +
                    "innovations or new ideas based on the findings.\n" +
                    "Suggestions for future research should also be included in this chapter")
        notes.add(note)
        note = NoteInfo(chapter, "Conclusion",
            "“Limit this section to a discussion of summarized data that were presented " +
                    "earlier in your thesis.\n" +
                    "Do not present new information. \n " +
                    "Use the Conclusion to articulate your main points with clarity;" +
                    "to reiterate, summarize, and perhaps re-sequence the Findings;" +
                    "and to start winding down your thesis narrative")
        notes.add(note)




    }


}