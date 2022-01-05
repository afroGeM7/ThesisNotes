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
            "The Introduction is not a narrative, help the reader" +
                    "understand what" +
                    "will be presented in the thesis, and why" +
                    "“The author(s) should indicate why the study is important"+
                    "(McMillan & Schumacher, 2010).")
        notes.add(note)
        note = NoteInfo(chapter, "Background Research",
            "This section describes generally about the intended study.")
        notes.add(note)

        chapter = chapters["chapter_2"]!!
        note = NoteInfo(chapter, "Chapter 2: Literature Review",
            "This section outlines what you learned from previous contributors to the field."
                    )
        notes.add(note)
        note = NoteInfo(chapter, "Introductory section",
            "Identifies common topics, issues, or areas of focus, " +
                    "then provide the appropriate context" +
                    "for the literature review. ")
        notes.add(note)

        chapter = chapters["chapter_3"]!!
        note = NoteInfo(chapter, "Chapter 3: Methodology",
            "This section helps readers to determine the validity of the research.")
        notes.add(note)
        note = NoteInfo(chapter, "the research approach section,",
            "Research approach, for example qualitative or quantitative research, " +
                    "Mixed-Method,Design and Developmental Research (DDR), " +
                    "Design-based Research (DBR) and Action Research.")
        notes.add(note)

        chapter = chapters["chapter_4"]!!
        note = NoteInfo(chapter, "Chapter 4: Findings",
            "Report and discuss your results here.")
        notes.add(note)
        note = NoteInfo(chapter, "Data Analysis Results",
            "The overall findings and analysis" +
                    "of the study can be presented.")
        notes.add(note)

        chapter = chapters["chapter_5"]!!
        note = NoteInfo(chapter, "Chapter 5: Discussion",
            "Discussion, Conclusions, Limitations and Recommendations \n" +
                    "This chapter should briefly summarize the research findings.")
        notes.add(note)
        note = NoteInfo(chapter, "Conclusion",
            "“Limit this section to a discussion of summarized data that were presented " +
                    "earlier in your thesis.")
        notes.add(note)




    }


}